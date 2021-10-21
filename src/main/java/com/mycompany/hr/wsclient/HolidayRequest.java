
package com.mycompany.hr.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://mycompany.com/hr/schemas}Holiday"/>
 *         &lt;element ref="{http://mycompany.com/hr/schemas}Employee"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "holiday",
    "employee"
})
@XmlRootElement(name = "HolidayRequest")
public class HolidayRequest {

    @XmlElement(name = "Holiday", required = true)
    protected Holiday holiday;
    @XmlElement(name = "Employee", required = true)
    protected Employee employee;

    /**
     * 获取holiday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Holiday }
     *     
     */
    public Holiday getHoliday() {
        return holiday;
    }

    /**
     * 设置holiday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Holiday }
     *     
     */
    public void setHoliday(Holiday value) {
        this.holiday = value;
    }

    /**
     * 获取employee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * 设置employee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

}
