package com.bw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShenheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShenheExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andQishuIsNull() {
            addCriterion("qishu is null");
            return (Criteria) this;
        }

        public Criteria andQishuIsNotNull() {
            addCriterion("qishu is not null");
            return (Criteria) this;
        }

        public Criteria andQishuEqualTo(String value) {
            addCriterion("qishu =", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuNotEqualTo(String value) {
            addCriterion("qishu <>", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuGreaterThan(String value) {
            addCriterion("qishu >", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuGreaterThanOrEqualTo(String value) {
            addCriterion("qishu >=", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuLessThan(String value) {
            addCriterion("qishu <", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuLessThanOrEqualTo(String value) {
            addCriterion("qishu <=", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuLike(String value) {
            addCriterion("qishu like", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuNotLike(String value) {
            addCriterion("qishu not like", value, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuIn(List<String> values) {
            addCriterion("qishu in", values, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuNotIn(List<String> values) {
            addCriterion("qishu not in", values, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuBetween(String value1, String value2) {
            addCriterion("qishu between", value1, value2, "qishu");
            return (Criteria) this;
        }

        public Criteria andQishuNotBetween(String value1, String value2) {
            addCriterion("qishu not between", value1, value2, "qishu");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andBenjinIsNull() {
            addCriterion("benjin is null");
            return (Criteria) this;
        }

        public Criteria andBenjinIsNotNull() {
            addCriterion("benjin is not null");
            return (Criteria) this;
        }

        public Criteria andBenjinEqualTo(Long value) {
            addCriterion("benjin =", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinNotEqualTo(Long value) {
            addCriterion("benjin <>", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinGreaterThan(Long value) {
            addCriterion("benjin >", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinGreaterThanOrEqualTo(Long value) {
            addCriterion("benjin >=", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinLessThan(Long value) {
            addCriterion("benjin <", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinLessThanOrEqualTo(Long value) {
            addCriterion("benjin <=", value, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinIn(List<Long> values) {
            addCriterion("benjin in", values, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinNotIn(List<Long> values) {
            addCriterion("benjin not in", values, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinBetween(Long value1, Long value2) {
            addCriterion("benjin between", value1, value2, "benjin");
            return (Criteria) this;
        }

        public Criteria andBenjinNotBetween(Long value1, Long value2) {
            addCriterion("benjin not between", value1, value2, "benjin");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andJisuandateIsNull() {
            addCriterion("jisuandate is null");
            return (Criteria) this;
        }

        public Criteria andJisuandateIsNotNull() {
            addCriterion("jisuandate is not null");
            return (Criteria) this;
        }

        public Criteria andJisuandateEqualTo(Date value) {
            addCriterionForJDBCDate("jisuandate =", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jisuandate <>", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateGreaterThan(Date value) {
            addCriterionForJDBCDate("jisuandate >", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jisuandate >=", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateLessThan(Date value) {
            addCriterionForJDBCDate("jisuandate <", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jisuandate <=", value, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateIn(List<Date> values) {
            addCriterionForJDBCDate("jisuandate in", values, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jisuandate not in", values, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jisuandate between", value1, value2, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andJisuandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jisuandate not between", value1, value2, "jisuandate");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("lastdate is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("lastdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterionForJDBCDate("lastdate =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastdate <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lastdate >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastdate >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterionForJDBCDate("lastdate <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastdate <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterionForJDBCDate("lastdate in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastdate not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastdate between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastdate not between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andShenheIsNull() {
            addCriterion("shenhe is null");
            return (Criteria) this;
        }

        public Criteria andShenheIsNotNull() {
            addCriterion("shenhe is not null");
            return (Criteria) this;
        }

        public Criteria andShenheEqualTo(Long value) {
            addCriterion("shenhe =", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotEqualTo(Long value) {
            addCriterion("shenhe <>", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThan(Long value) {
            addCriterion("shenhe >", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThanOrEqualTo(Long value) {
            addCriterion("shenhe >=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThan(Long value) {
            addCriterion("shenhe <", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThanOrEqualTo(Long value) {
            addCriterion("shenhe <=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheIn(List<Long> values) {
            addCriterion("shenhe in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotIn(List<Long> values) {
            addCriterion("shenhe not in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheBetween(Long value1, Long value2) {
            addCriterion("shenhe between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotBetween(Long value1, Long value2) {
            addCriterion("shenhe not between", value1, value2, "shenhe");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}