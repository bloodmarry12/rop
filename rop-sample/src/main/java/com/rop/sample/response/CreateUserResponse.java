/**
 * 日    期：12-2-29
 */
package com.rop.sample.response;


import com.rop.sample.sys.DateXmlAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "createUserResponse")
public class CreateUserResponse{

    @XmlAttribute
    private String userId;

    @XmlAttribute
    private String createTime;

    @XmlElement
    private Foo foo = new Foo("0","0");

    @XmlElement
    private String feedback;

    @XmlElement
    private List<Foo> fooList;

    @XmlElement
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    private Date date;

    private boolean ok = true;

    public List<Foo> getFooList() {
        return fooList;
    }

    public void setFooList(List<Foo> fooList) {
        this.fooList = fooList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

