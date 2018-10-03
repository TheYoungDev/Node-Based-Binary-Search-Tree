﻿# Node-Based-Binary-Search-Tree


# Definitions:

• A set is an unordered collection of elements with no repetition. Examples are the
set of real numbers, the set of integer numbers or the set consisting of numbers
1, 2, 30.

• For this assignment we will only be considering representing finite sets consisting
of elements which are integers. Examples: {0, 34, 78, 1000}, {4, 5, 890, 65535},
{0, 1, 2, · · · , 65534, 65535}, {} are all valid sets.

• The union of two sets, say A and B, is written as A∪B and is the set which contains
all of the elements in either A or B or both. Example: If A = {3, 8, 14, 15} and
B = {2, 8, 9, 15, 100}, then A ∪ B = {2, 3, 8, 9, 14, 15, 100} (notice that there are no
repeated elements in a set).

• The intersection of two sets A and B is written as A∩B and is the set which contains
the elements that are common to A and B. Examples: If A = {3, 8, 14, 15} and
B = {2, 8, 9, 15, 100}, then A ∩ B = {8, 15}. If A = {17, 20, 38} and B = {200},
then A ∩ B = {}, which is termed the empty set.

# Specifications:

• You have to use the Java class TNode given below, to implement the tree nodes.
Classes TNode and BSTSet must be contained in the same package.
public class TNode{
int element;
TNode left;
TNode right;
TNode(int i, TNode l, TNode r)
{ element =i; left = l; right = r; }
}//end class

• Class BSTSet must contain only a private field named root, of type TNode, which
is a reference to the root of the tree. No other fields are allowed. When the set is
empty you should have root==null.

• Class BSTSet must contain the following constructors:

- public BSTSet() - initializes the BSTSet object to represent the empty set
(an empty tree).

- public BSTSet(int[] input) - initializes the BSTSet object to represent the
set containing all elements in array input, without repetitions. For example,
if the array is: 5, 7, 4, 5, then the corresponding set is {5, 7, 4}.

• Class BSTSet must contain the following public methods:

1) public boolean isIn(int v): Returns true if integer v is an element of
this BSTSet. It returns false otherwise.

2) public void add(int v): Adds v to this BSTSet if v was not already an
element of this BSTSet. It does nothing otherwise.

3) public boolean remove(int v): Removes v from this BSTSet if v was an
element of this BSTSet and returns true. Returns false if v was not an
element of this BSTSet.

4) public BSTSet union(BSTSet s): Returns a new BSTSet which represents
the union of this BSTSet and s. This method should not modify the input
sets.

5) public BSTSet intersection(BSTSet s): Returns a new BSTSet which represents
the intersection of this BSTSet and s. This method should not modify
the input sets.

7) public int size(): Returns the number of elements in this set.

6) public void printBSTSet(): Outputs the elements of this set to the console,
in increasing order.

7) private void printBSTSet(TNode t): Outputs to the console the elements
stored in the subtree rooted in t, in increasing order.

8) For the two printing methods specified above you must use the following code

public void printBSTSet(){
if(root==null)
System.out.println("The set is empty");
else{
System.out.print("The set elements are: ");
printBSTSet(root);
System.out.print("\n");
}
}
private void printBSTSet(TNode t){
if(t!=null){
printBSTSet(t.left);
System.out.print(" " + t.element + ", ");
printBSTSet(t.right);
}
}
