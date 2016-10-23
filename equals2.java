/*Write a method equals2 that accepts a second list as a parameter
 * and that returns true if the two lists are equal and that returns 
 * false otherwise. Two lists are considered equal if they store
 * exactly the same values in exactly the same order and have exactly
 * the same length.
 */

public boolean equals2(LinkedIntList list){
    return equalsRec(front,list.front);
}
public boolean equalsRec(ListNode one, ListNode two){
    if(one==null && two==null){
        return true;
    }
    if(one==null || two==null){
        return false;
    }
    if(one.data==two.data){
        return equalsRec(one.next, two.next);
    }
    return false;
}