package step4.lambda;

public class Example1 {

    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
        btnOk.click();

        Button btnCancel = new Button();
        btnOk.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
        btnOk.click();
    }
}
