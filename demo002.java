public class demo002 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode result2=result;
        int carry=0,temp,x,y; //cary:进位 temp:个位数
        while(l1!=null || l2!=null){
            x=(l1!=null)?l1.val:0;
            y=(l2!=null)?l2.val:0;
            temp=x+y+carry;
            System.out.println(temp);
            if(temp>=10){
                temp-=10;
                carry=1;
            }else{
                carry=0;
            }
            result.next=new ListNode(temp);
            result=result.next;
            if(l1!=null){ l1=l1.next; }
            if(l2!=null){ l2=l2.next; }
        }
        if(carry==1){result.next=new ListNode(1);}
        return  result2.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(5);
        ListNode l3=new ListNode(9);
        ListNode l4=new ListNode(6);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(9);
        l1.next=l3;l3.next=l5;
        l2.next=l4;l4.next=l6;
        ListNode result=addTwoNumbers(l1,l2);
        System.out.print(result.val);
        while(result.next!=null){
            result=result.next;
            System.out.print("->"+result.val);
        }

    }
}
