public class Test {
    public static void main(String[] args) {
        Tree numbers = new Tree();
        numbers.insert(50);
        numbers.insert(36);
        numbers.insert(98);
        numbers.insert(15);
        numbers.insert(33);
        numbers.insert(67);
        numbers.insert(91);
        numbers.insert(108);
        numbers.insert(23);
        numbers.insert(78);
        numbers.insert(62);
        numbers.delete(91);
        numbers.inorder();
    }
}
