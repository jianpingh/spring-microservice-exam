package com.github.huangjianping.common.core.vo;


import com.github.huangjianping.common.core.persistence.BaseEntity;

/**
 * 部门vo
 *
 * @author huang jianping
 * @date 2018/12/31 22:02
 */
public class DeptVo extends BaseEntity<DeptVo> {

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
