
class node
{
    public int data;
    public node next;
}

class program444
{
    public static void main(String A [] )
    {
        node newn = null;       // refreance

        newn = new node();

        newn.data = 11;
        newn.next = null;

        System.out.println(newn.data);
        System.out.println(newn.next);
    }
}

/*
-------------------------------------------------------------------------------------
                SingLL      SinglyCL        DoublyLL    DoublyCL    Stack   Queue
-------------------------------------------------------------------------------------
C               DONE           DONE         DONE          DONE      --      --
C++             DONE           DONE         DONE          DONE      --      --
Java            DONE            --           --            --       --      --
C++ generic     --              --           --            --       --      --
-------------------------------------------------------------------------------------
*/