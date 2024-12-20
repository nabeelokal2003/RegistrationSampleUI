public class RegModel {
    private String username;
    private String password;
    private String fullname;
    private String gender;
    private String email;
    private String major;
    private String skills;
    RegModel(String username, String password, String fullname, String gender, String email, String major, String skills) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.major = major;
        this.skills = skills;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}