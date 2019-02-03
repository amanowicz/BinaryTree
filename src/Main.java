import model.Node;
import util.Trees;

public class Main {

    public static void main(String[] args) {

       Node root = Trees.createTree();

        System.out.println(Trees.sumNodes(root));
        System.out.println(Trees.sumNodesValues(root));
        System.out.println(Trees.depth(root));
        System.out.println(Trees.maxValue(root));
        System.out.println(Trees.getRepeatNumber(root, 2));


    }
}
