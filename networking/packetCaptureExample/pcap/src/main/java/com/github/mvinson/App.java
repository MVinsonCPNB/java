package com.github.mvinson;

import java.io.IOException;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.PcapNetworkInterface.PromiscuousMode;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.NifSelector;

/**
 * Example found at: https://www.devdungeon.com/content/packet-capturing-java-pcap4j
 */

public class App{


  static PcapNetworkInterface getNetworkDevice(){
  

    /* // Instead of using NifSelector, you can get the 
     * // list of network devices from the system
     *
     * List<PcapNetworkInterface> allDevs = null;
     *
     * try { 
     *    allDevs = Pcaps.findAllDevs();
     *    } catch (PcapNativeException e) {
     *      throw new IOExeption(e.getMessage());
     *    }
     *
     *    if (allDevs == null || allDevs.isEmpty()) {
     *      throw new IOException("No NIF to capture.");
     *    }
     */
    
        // The class that will store the network device
        // we want to use for capturing
    PcapNetworkInterface device = null;  
        // Pcap4j comes with a convenient method for listing
        // and choosing a network interface from the terminal
    try {
        // List the network devices available with a prompt
      device = new NifSelector().selectNetworkInterface();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return device;
  }

  public static void main( String[] args ){
    
    PcapNetworkInterface device = getNetworkDevice();
    System.out.println("You chose: " + device);

    if (device == null){
      System.out.println("No device chosen.");
      System.exit(1);
    }
    
    // Open the device and get a handle
    int snapshotLength = 65536; // in bytes
    int readTimeout = 50;       // in milliseconds
    final PcapHandle handle;
    try {
      handle = device.openLive(snapshotLength, PromiscuousMode.PROMISCUOUS, readTimeout);

      // Create a listener that defines what to do with the reveived packets
      PacketListener listener = new PacketListener(){
        @Override
        public void gotPacket(Packet packet){
          // Override the default gotPacket() function and process packet
          System.out.println(handle.getTimestamp());
          System.out.println(packet);
          System.out.println(packet.getHeader());
        }
      };

      // Tell the handle to loop using the listener we created
      try {
        int maxPackets = 50;
        handle.loop(maxPackets, listener);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (PcapNativeException e){
        e.printStackTrace();
      } catch (NotOpenException e){
        e.printStackTrace();
      }

      // Cleanup when complete
      handle.close();

    } catch (PcapNativeException e){
      e.printStackTrace();
    }
  }
}
