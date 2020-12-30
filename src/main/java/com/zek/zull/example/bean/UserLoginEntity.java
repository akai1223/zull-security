package com.zek.zull.example.bean;

import java.util.List;

/**
 * description：
 *
 * @author zhangkai
 * @date 2020/12/30 16:32
 */
public class UserLoginEntity {

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private ManagerUserBean managerUser;
        private List<RoleListBean> roleList;
        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public ManagerUserBean getManagerUser() {
            return managerUser;
        }

        public void setManagerUser(ManagerUserBean managerUser) {
            this.managerUser = managerUser;
        }

        public List<RoleListBean> getRoleList() {
            return roleList;
        }

        public void setRoleList(List<RoleListBean> roleList) {
            this.roleList = roleList;
        }

        public static class ManagerUserBean {


            private int id;
            private String tel;
            private String email;
            private Object password;
            private String name;
            private String address;
            private Object photo;
            private boolean sign;
            private String createtime;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public Object getPassword() {
                return password;
            }

            public void setPassword(Object password) {
                this.password = password;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public Object getPhoto() {
                return photo;
            }

            public void setPhoto(Object photo) {
                this.photo = photo;
            }

            public boolean isSign() {
                return sign;
            }

            public void setSign(boolean sign) {
                this.sign = sign;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }
        }

        public static class RoleListBean {


            private int id;
            private int pid;
            private String name;
            private String codeName;
            private Object sign;
            private Object createtime;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCodeName() {
                return codeName;
            }

            public void setCodeName(String codeName) {
                this.codeName = codeName;
            }

            public Object getSign() {
                return sign;
            }

            public void setSign(Object sign) {
                this.sign = sign;
            }

            public Object getCreatetime() {
                return createtime;
            }

            public void setCreatetime(Object createtime) {
                this.createtime = createtime;
            }
        }
    }
}
