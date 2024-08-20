package step1.movieReview;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview2[] review = new MovieReview2[2];
        MovieReview2 inception = new MovieReview2();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        review[0] = inception;

        MovieReview2 aboutTime = new MovieReview2();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        review[1] = aboutTime;

        for (MovieReview2 review2 : review) {
            System.out.println("제목 : " + review2.title + "리뷰 : " + review2.review);
        }
    }
}
