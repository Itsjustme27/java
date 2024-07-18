public class RawBox {
    private Object content;

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }
    
     public static void main(String[] args) {
        RawBox rawBox = new RawBox();
        // This is fine
        rawBox.setContent("This is a string"); // This is also fine at compile-time
		 rawBox.setContent(123);
        // But we get a runtime error when trying to cast the content
        String content = (String) rawBox.getContent(); // ClassCastException at runtime if the last setContent was an Integer
        System.out.println(content);
    }
}
