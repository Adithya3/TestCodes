package interview.microsoft.preparation.deepcopy;

import java.util.HashMap;

public class DeepCopy {
    public static Node copyRandomList(Node head) {
        Node current=head,clonecurrent,clonestart;
        HashMap<Integer, Node> nodeMap=new HashMap();

        //edge case
        if(head==null) return null;


        //base case
        clonecurrent=new Node(current.val);
        clonestart=clonecurrent;
        nodeMap.put(current.val,clonecurrent);
        current=current.next;


        while(current!=null){
            clonecurrent.next=new Node(current.val);
            clonecurrent=clonecurrent.next;
            clonecurrent.next=current.next;
            nodeMap.put(current.val,clonecurrent);
            current=current.next;
        }

        //second loop for setting return values
        clonecurrent=clonestart;
        current=head;
        while(clonecurrent!=null){
            if(current.random!=null){
                clonecurrent.random=nodeMap.get(current.random.val);
            }else{
                clonecurrent.random=null;
            }
            clonecurrent=clonecurrent.next;
            current=current.next;
        }


        //return statement
        return clonestart;
    }

    public static void main(String[] args) {
        Node result;
        Node seven = new Node(7);
        Node thirteen = new Node(13);
        Node eleven = new Node(11);
        Node ten = new Node(10);
        Node one = new Node(1);

        seven.next=thirteen;
        thirteen.next=eleven;
        eleven.next=ten;
        ten.next=one;

        seven.random=null;
        thirteen.random=seven;
        eleven.random=one;
        ten.random=eleven;
        one.random=seven;

        result=DeepCopy.copyRandomList(seven);

        while (result!=null){
            if (result.random!=null){
                System.out.println(result.random.val);
            }else {
                System.out.println(result.random);
            }
            result=result.next;
        }
    }
}
