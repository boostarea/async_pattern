package ActiveObject.A12;

public class SearcherFactory {
    public static Searcher createSearcher() {
        return new SearcherImpl();
    }
}
