package step3.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> visit = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String s) {
        if (currentPage != null){
            visit.push(currentPage);
        }
        currentPage = s;
        System.out.println("방문 : " + s);
    }

    public String goBack() {
        if (!visit.isEmpty()){
            currentPage = visit.pop();
            System.out.println("뒤로가기 : " + currentPage);
            return currentPage;
        }
        return null;
    }
}
