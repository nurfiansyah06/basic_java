public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "arep","fian", "arif",
                "software", "engineer", "java",
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (var name: names) {
            System.out.println(name);
        }
    }
}
