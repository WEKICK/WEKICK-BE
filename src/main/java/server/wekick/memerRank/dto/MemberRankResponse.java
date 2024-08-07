package server.wekick.memerRank.dto;

import java.util.List;

public class MemberRankResponse {
    private int page;
    private int pageSize;
    private int totalPages;
    private int totalRecords;
    private List<Member> members;

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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public static class Member {
        private String userId;
        private String userName;
        private int rankScore;

        public Member(String userId, String userName, int rankScore) {
            this.userId = userId;
            this.userName = userName;
            this.rankScore = rankScore;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getRankScore() {
            return rankScore;
        }

        public void setRankScore(int rankScore) {
            this.rankScore = rankScore;
        }
    }
}
