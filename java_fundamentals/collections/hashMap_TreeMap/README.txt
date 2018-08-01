# JukeBox1

# This example app shows how to use the collections package.

# Examples of how to instruct the Collections.sort() to sort
# a non-string type object such as the Song class, such as 
# making Song implement Comparable<Song> interface and overridding
# the compareTo method. Additionally, an innerclass can be built 
# to work with the Collections.sort() method by passing two 
# paramerters first is a list type and second is a class which 
# extends the Comparator<Song> interface, thereby allowing for 
# a list type object to be sorted in a variety of ways. You 
# can sort by Artist name, Song Title, Beat-per-minute, all 
# by declaring seperate classes for each desired output.  

# See Chapter 16 Collections and Generics on page 529 of 
# Java Head First written by Kathy Sierra & Bert Bates

# "LIST - when sequence matters
#   Collections that know about index position
#   Lists know where somthing is in the list. You
#   can have more than one element referenceing 
#   the same object" (Sierra & Bates (2005), pg.557).

# "SET - when uniqueness matters
#   Collections that do not allow duplicates.
#   Sets known whether somthing is already in the collection.
#   You can never have more than one element referencing 
#   the some object (or more than one element referenceing
#   two objects that are considered equal" (Sierra & Bates (2005), pg.557).

# "MAP - when finding something by key matters
#   Collections that use key-value pairs.
#   Maps know the value associated with a given key. You
#   can have two keys that reference the same value, but 
#   you cannot have duplicate key. Although keys are typically
#   String names (so that you can make name/value property 
#   lists, for example), a key can be any object" (Sierra & Bates (2005), pg.557).

#References: 
# Sierra, K., & Bates, B. (2005). Java Head First 2nd Ed. O'REILLY
