import java.util.Scanner;

//2 Реализовать поиск в дереве (Iterative deepening depth-first search)

public class Task2 {
    
    //Метод постепенно увеличивает глубину поиска, пока элемент не найден
    public static boolean search(Tree.Node root, int target) {
        if (root == null) {
            return false;
        }

        int limit = 0; // начальная глубина

        while (true) {
            System.out.println("\nПоиск на глубине: " + limit);

            boolean found = dfs(root, target, limit);

            if (found) {
                System.out.println("Элемент " + target + " найден на глубине " + limit);
                return true;
            }
            limit += 1;
        }
    }


    //DFS с ограничением глубины
    public static boolean dfs(Tree.Node node, int targetNode, int limit) {
        if (node == null) {
            return false;
        }

        if (node.data == targetNode) {
            System.out.println("Найден узел: " + node.data);
            return true;
        }

        if (limit == 0) {
            return false;
        }

        // рекурсивный поиск в левом и правом поддереве с уменьшением лимита
        return dfs(node.left, targetNode, limit - 1) || dfs(node.right, targetNode, limit - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = Utils.createTree(scanner);
        System.out.println("Структура дерева:");
        Utils.printInOrder(tree.root);
        System.out.println();

        int target = Utils.inputTarget(scanner);

        boolean found = search(tree.root, target);
        if (!found) {
            System.out.println("Элемент не найден");
        }
    }

}
