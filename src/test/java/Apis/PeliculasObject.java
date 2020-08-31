package Apis;

import java.util.ArrayList;

public class PeliculasObject {

    ArrayList< Object > Search = new ArrayList < Object > ();
    private String totalResults;
    private String Response;

    public PeliculasObject(String totalResults, String response,ArrayList< Object > Search) {
        this.totalResults = totalResults;
        Response = response;
        Search = Search;
    }

    public ArrayList<Object> getSearch() {
        return Search;
    }
// Getter Methods

    public String getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return Response;
    }

    // Setter Methods

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public void setSearch(ArrayList<Object> search) {
        Search = search;
    }
}
