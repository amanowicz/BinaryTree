package util;

import model.Node;

public class Trees {

    public static Node createTree(){
        Node root = new Node("2");
        Node lChild1 = new Node("7");
        Node rChild1 = new Node("5");
        Node lLChild2 = new Node("2");
        Node lRChild2 = new Node("6");
        Node rRChild2 = new Node("9");
        Node lLRChild3 = new Node("5");
        Node rLRChild3 = new Node("11");
        Node lRRChild3 = new Node("4");

        root.setlChild(lChild1);
        root.setrChild(rChild1);

        lChild1.setlChild(lLChild2);
        lChild1.setrChild(lRChild2);
        rChild1.setrChild(rRChild2);

        lRChild2.setlChild(lLRChild3);
        lRChild2.setrChild(rLRChild3);
        rRChild2.setlChild(lRRChild3);

        return root;
    }

    public static int sumNodesValues(Node node){
        if (node == null){
            return 0;
        }

        return Integer.valueOf(node.getValue()) + sumNodesValues(node.getlChild()) + sumNodesValues(node.getrChild());
    }

    public static int sumNodes(Node node){
        if (node == null){
            return 0;
        }

        return 1 + sumNodes(node.getlChild()) + sumNodes(node.getrChild());
    }

    public static int depth(Node node){
        if (node == null){
            return 0;
        }
        return 1 + Math.max(depth(node.getlChild()), depth(node.getrChild()));
    }

    public static int maxValue(Node node){
        if (node == null){
            return 0;
        }

        int maxLeftSide = max(node, maxValue(node.getlChild()));
        return Math.max(maxLeftSide, maxValue(node.getrChild()));
    }

    private static int max(Node node, int value){
        return Math.max(Integer.valueOf(node.getValue()), value);
    }
}
