package homework.homework8;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char chars = text.charAt(i);
            char pop;
            switch (chars) {
                case '(':
                case '{':
                case '[':
                    stack.push(chars);
                    break;
                case ')':
                    pop = (char) stack.pop();
                    if (pop != '(') {
                        System.err.println("error at" + i + ": closed " + chars + " but opened " + pop);
                    }
                    break;
                case '}':
                    pop = (char) stack.pop();
                    if (pop != '{') {
                        System.err.println("error at" + i + ": closed " + chars + " but opened " + pop);
                    }
                    break;
                case ']':
                    pop = (char) stack.pop();
                    if (pop != '[') {
                        System.err.println("error at" + i + ": closed " + chars + " but opened " + pop);
                    }
                    break;
            }
        }
    }
}
