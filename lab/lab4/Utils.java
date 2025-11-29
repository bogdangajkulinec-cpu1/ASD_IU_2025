import java.util.Scanner;

public class Utils {
    public static Tree createTree(Scanner scanner) {
        Tree tree = new Tree();

        System.out.print("Введите количество узлов ");
        int n = scanner.nextInt();

        System.out.println("Введите значения узлов ");

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            tree.insert(val);
        }

        return tree;
    }

    // Ввод элемента для поиска
    public static int inputTarget(Scanner scanner) {
        System.out.print("\nВведите элемент для поиска: ");
        return scanner.nextInt();
    }

    // Метод для печати дерева
    public static void printInOrder(Tree.Node node) {
        printInOrderRecursive(node, 0);
    }
    // Внутренний рекурсивный метод
    private static void printInOrderRecursive(Tree.Node node, int level) {
        if (node == null) {
            return;
        }
        printInOrderRecursive(node.left, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);

        printInOrderRecursive(node.right, level + 1);
    }
}
