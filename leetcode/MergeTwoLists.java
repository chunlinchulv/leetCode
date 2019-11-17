package com.leetcode;

import org.w3c.dom.Node;

public class MergeTwoLists {

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {                   //无参构造
            this(0,null);
        }
        public ListNode(int x) {              //带一个参数构造
            this(x,null);
        }
        public ListNode(int val,ListNode next) {      //带两个参数构造
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addNode(int data,ListNode node) {
        ListNode newNode = new ListNode(data);
        newNode.next = null;
        //实例化一个节点
        if (node.next == null) {                      //插入第一个节点
            node.next = newNode;                 //不在第一个节点中存储有效数据
            return node;
        }
        ListNode temp = node;                   //可以判断  要是链表很长 它还要遍历到表尾  多浪费时间
        while (temp.next != null) {              //将指针移动到表尾
            temp = temp.next;
        }
        temp.next = newNode;
        return node;

    }
    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode list1 = new ListNode(1);
        list1.next = null;
        list1 = mergeTwoLists.addNode(2,list1);
        list1 = mergeTwoLists.addNode(3,list1);
        System.out.println("链表1：");
        printList(list1);
        ListNode list2 = new ListNode(1);
        list2.next = null;
        list2 = mergeTwoLists.addNode(2,list2);
        list2 = mergeTwoLists.addNode(4,list2);
        System.out.println("链表2：");
        printList(list2);
        System.out.println("合并后的链表：");
        printList(mergeLists(list1,list2));
    }

    private static void printList(ListNode mergeLists) {
        ListNode temp = mergeLists;
        while (true) {
            System.out.print(temp.val);
            temp = temp.next;
            if(temp.next == null) {
                System.out.print(temp.val);
                break;
            }
        }
        System.out.println("\n");
    }

    private static ListNode mergeLists(ListNode listNode1, ListNode listNode2) {
        ListNode temp1 = listNode1.next;
        ListNode temp2 = listNode2.next;
        ListNode flag = temp2;
        if(temp1.val > temp2.val) {                 //以第一个节点中数值较小的链作为目标链
            temp1 = listNode2.next;
            temp2 = listNode1.next;
            flag = temp2;
        }
        while(temp1.next != null && temp2.next != null) {
            if(temp2.val <= temp1.next.val) {
                flag = flag.next;                   //第二个链表的指针向后移动一位
                temp2.next = temp1.next;
                temp1.next = temp2;
                temp2 = flag;
                temp1 = temp1.next;
            }else {
                temp1 = temp1.next;
            }
        }
        if(temp1.next == null) {
            temp1.next = temp2;
        }else if (temp2.next == null) {
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp1 = temp1.next;
        }
        return listNode1;
    }
}
