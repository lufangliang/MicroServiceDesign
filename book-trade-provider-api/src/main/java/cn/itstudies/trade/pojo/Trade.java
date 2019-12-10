package cn.itstudies.trade.pojo;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer userId;

    private Integer price;

    private Byte payStatus;

    private Byte payType;

    private String gatewayPayNum;

    private Date gatewayPayTime;

    private Integer gatewayPayPrice;

    private Byte deleted;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public String getGatewayPayNum() {
        return gatewayPayNum;
    }

    public void setGatewayPayNum(String gatewayPayNum) {
        this.gatewayPayNum = gatewayPayNum;
    }

    public Date getGatewayPayTime() {
        return gatewayPayTime;
    }

    public void setGatewayPayTime(Date gatewayPayTime) {
        this.gatewayPayTime = gatewayPayTime;
    }

    public Integer getGatewayPayPrice() {
        return gatewayPayPrice;
    }

    public void setGatewayPayPrice(Integer gatewayPayPrice) {
        this.gatewayPayPrice = gatewayPayPrice;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", price=").append(price);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payType=").append(payType);
        sb.append(", gatewayPayNum=").append(gatewayPayNum);
        sb.append(", gatewayPayTime=").append(gatewayPayTime);
        sb.append(", gatewayPayPrice=").append(gatewayPayPrice);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Trade other = (Trade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getGatewayPayNum() == null ? other.getGatewayPayNum() == null : this.getGatewayPayNum().equals(other.getGatewayPayNum()))
            && (this.getGatewayPayTime() == null ? other.getGatewayPayTime() == null : this.getGatewayPayTime().equals(other.getGatewayPayTime()))
            && (this.getGatewayPayPrice() == null ? other.getGatewayPayPrice() == null : this.getGatewayPayPrice().equals(other.getGatewayPayPrice()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getGatewayPayNum() == null) ? 0 : getGatewayPayNum().hashCode());
        result = prime * result + ((getGatewayPayTime() == null) ? 0 : getGatewayPayTime().hashCode());
        result = prime * result + ((getGatewayPayPrice() == null) ? 0 : getGatewayPayPrice().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}