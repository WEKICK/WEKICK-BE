package server.wekick.crewRank.dto;

import java.util.List;

public class CrewRankResponse {
    private String type;
    private int page;
    private int pageSize;
    private int totalPages;
    private int totalRecords;
    private List<Crew> crew;

    public String getType() { return type;}

    public void setType(String type) { this.type = type;}

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<Crew> getMembers() {
        return crew;
    }

    public void setMembers(List<Crew> crew) {
        this.crew = crew;
    }

    public static class Crew {
        private String crewName;
        private int rankScore;

        public Crew(String crewName, int rankScore) {
            this.crewName = crewName;
            this.rankScore = rankScore;
        }

        public String getUserName() {
            return crewName;
        }

        public void setUserName(String userName) {
            this.crewName = crewName;
        }

        public int getRankScore() {
            return rankScore;
        }

        public void setRankScore(int rankScore) {
            this.rankScore = rankScore;
        }
    }
}
