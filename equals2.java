public boolean equals2(LinkedIntList list){
    return equalsRec(front,list.front);
}
public boolean equalsRec(ListNode one, ListNode two){
    if(one==null && two==null){
        return true;
    }
    if(one==null || two==null){
        return false;
    }
    if(one.data==two.data){
        return equalsRec(one.next, two.next);
    }
    return false;
}