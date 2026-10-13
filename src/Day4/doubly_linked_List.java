package Day4;

class dNode{
    int data;
    dNode prev;
    dNode next;
    dNode(int d){
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}

class doublyLinkedList{
    dNode head;

    public void add(int data){
        dNode newNode = new dNode(data);

        if(head == null){
            head = newNode;
            return;
        }
        dNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void forwardTraversal(){
        if(head == null){
            return;
        }
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }System.out.print("null \n");
    }
    public void backwordTraverse(){
        if(head == null){
            return;
        }
        dNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " <-->");
            temp = temp.prev;
        }System.out.print("null \n");
    }
}

public class doubly_linked_List {
    public static void main(){
        doublyLinkedList DL = new doublyLinkedList();

        DL.add(12);
        DL.add(17);
        DL.add(65);
        DL.add(123);
        DL.add(76);

        DL.forwardTraversal();
        DL.backwordTraverse();
    }
}
