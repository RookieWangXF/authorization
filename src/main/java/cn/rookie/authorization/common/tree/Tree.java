package cn.rookie.authorization.common.tree;

import cn.rookie.authorization.entity.Function;

import java.util.*;


/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.common.tree
 * Description:
 */
public class Tree {

    private List<Node> nodes = new LinkedList<>();

    private Node root = null;

    public Tree(List<Function> functions) {
        for (Function function : functions) {
            Node node = new Node(function.getId(), function.getParentId(), function.getName(), "open",
                    new NodeAttribute(null == function.getUrl() ? "" : function.getUrl(), function.getId()),
                    function.getSerialNum());
            nodes.add(node);

            if (node.getId() == 0) {
                root = node;
            }
        }
    }

    public List<Node> build() {
        buildTree(root);
        List<Node> result = new ArrayList<Node>();
        result.add(root);
        return result;
    }

    private void buildTree(Node parent) {
        Node node = null;
        for (Iterator<Node> ite = nodes.iterator();ite.hasNext();) {
            node = ite.next();
            if (Objects.equals(node.getParentId(), parent.getId())) {
                parent.getChildren().add(node);
                buildTree(node);
            }
        }
    }


}
