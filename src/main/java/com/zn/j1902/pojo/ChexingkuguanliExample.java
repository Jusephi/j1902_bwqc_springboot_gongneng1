package com.zn.j1902.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChexingkuguanliExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChexingkuguanliExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPingpaiIsNull() {
            addCriterion("pingpai is null");
            return (Criteria) this;
        }

        public Criteria andPingpaiIsNotNull() {
            addCriterion("pingpai is not null");
            return (Criteria) this;
        }

        public Criteria andPingpaiEqualTo(String value) {
            addCriterion("pingpai =", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiNotEqualTo(String value) {
            addCriterion("pingpai <>", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiGreaterThan(String value) {
            addCriterion("pingpai >", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiGreaterThanOrEqualTo(String value) {
            addCriterion("pingpai >=", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiLessThan(String value) {
            addCriterion("pingpai <", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiLessThanOrEqualTo(String value) {
            addCriterion("pingpai <=", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiLike(String value) {
            addCriterion("pingpai like", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiNotLike(String value) {
            addCriterion("pingpai not like", value, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiIn(List<String> values) {
            addCriterion("pingpai in", values, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiNotIn(List<String> values) {
            addCriterion("pingpai not in", values, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiBetween(String value1, String value2) {
            addCriterion("pingpai between", value1, value2, "pingpai");
            return (Criteria) this;
        }

        public Criteria andPingpaiNotBetween(String value1, String value2) {
            addCriterion("pingpai not between", value1, value2, "pingpai");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andChangshangIsNull() {
            addCriterion("changshang is null");
            return (Criteria) this;
        }

        public Criteria andChangshangIsNotNull() {
            addCriterion("changshang is not null");
            return (Criteria) this;
        }

        public Criteria andChangshangEqualTo(String value) {
            addCriterion("changshang =", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotEqualTo(String value) {
            addCriterion("changshang <>", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThan(String value) {
            addCriterion("changshang >", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThanOrEqualTo(String value) {
            addCriterion("changshang >=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThan(String value) {
            addCriterion("changshang <", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThanOrEqualTo(String value) {
            addCriterion("changshang <=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLike(String value) {
            addCriterion("changshang like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotLike(String value) {
            addCriterion("changshang not like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangIn(List<String> values) {
            addCriterion("changshang in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotIn(List<String> values) {
            addCriterion("changshang not in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangBetween(String value1, String value2) {
            addCriterion("changshang between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotBetween(String value1, String value2) {
            addCriterion("changshang not between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andChexiIsNull() {
            addCriterion("chexi is null");
            return (Criteria) this;
        }

        public Criteria andChexiIsNotNull() {
            addCriterion("chexi is not null");
            return (Criteria) this;
        }

        public Criteria andChexiEqualTo(String value) {
            addCriterion("chexi =", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotEqualTo(String value) {
            addCriterion("chexi <>", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThan(String value) {
            addCriterion("chexi >", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiGreaterThanOrEqualTo(String value) {
            addCriterion("chexi >=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThan(String value) {
            addCriterion("chexi <", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLessThanOrEqualTo(String value) {
            addCriterion("chexi <=", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiLike(String value) {
            addCriterion("chexi like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotLike(String value) {
            addCriterion("chexi not like", value, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiIn(List<String> values) {
            addCriterion("chexi in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotIn(List<String> values) {
            addCriterion("chexi not in", values, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiBetween(String value1, String value2) {
            addCriterion("chexi between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andChexiNotBetween(String value1, String value2) {
            addCriterion("chexi not between", value1, value2, "chexi");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("leixing like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("leixing not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andChexingIsNull() {
            addCriterion("chexing is null");
            return (Criteria) this;
        }

        public Criteria andChexingIsNotNull() {
            addCriterion("chexing is not null");
            return (Criteria) this;
        }

        public Criteria andChexingEqualTo(String value) {
            addCriterion("chexing =", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotEqualTo(String value) {
            addCriterion("chexing <>", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThan(String value) {
            addCriterion("chexing >", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThanOrEqualTo(String value) {
            addCriterion("chexing >=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThan(String value) {
            addCriterion("chexing <", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThanOrEqualTo(String value) {
            addCriterion("chexing <=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLike(String value) {
            addCriterion("chexing like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotLike(String value) {
            addCriterion("chexing not like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingIn(List<String> values) {
            addCriterion("chexing in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotIn(List<String> values) {
            addCriterion("chexing not in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingBetween(String value1, String value2) {
            addCriterion("chexing between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotBetween(String value1, String value2) {
            addCriterion("chexing not between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andNiankuanIsNull() {
            addCriterion("niankuan is null");
            return (Criteria) this;
        }

        public Criteria andNiankuanIsNotNull() {
            addCriterion("niankuan is not null");
            return (Criteria) this;
        }

        public Criteria andNiankuanEqualTo(String value) {
            addCriterion("niankuan =", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotEqualTo(String value) {
            addCriterion("niankuan <>", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanGreaterThan(String value) {
            addCriterion("niankuan >", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanGreaterThanOrEqualTo(String value) {
            addCriterion("niankuan >=", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanLessThan(String value) {
            addCriterion("niankuan <", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanLessThanOrEqualTo(String value) {
            addCriterion("niankuan <=", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanLike(String value) {
            addCriterion("niankuan like", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotLike(String value) {
            addCriterion("niankuan not like", value, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanIn(List<String> values) {
            addCriterion("niankuan in", values, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotIn(List<String> values) {
            addCriterion("niankuan not in", values, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanBetween(String value1, String value2) {
            addCriterion("niankuan between", value1, value2, "niankuan");
            return (Criteria) this;
        }

        public Criteria andNiankuanNotBetween(String value1, String value2) {
            addCriterion("niankuan not between", value1, value2, "niankuan");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenIsNull() {
            addCriterion("canshumingchen is null");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenIsNotNull() {
            addCriterion("canshumingchen is not null");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenEqualTo(String value) {
            addCriterion("canshumingchen =", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenNotEqualTo(String value) {
            addCriterion("canshumingchen <>", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenGreaterThan(String value) {
            addCriterion("canshumingchen >", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenGreaterThanOrEqualTo(String value) {
            addCriterion("canshumingchen >=", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenLessThan(String value) {
            addCriterion("canshumingchen <", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenLessThanOrEqualTo(String value) {
            addCriterion("canshumingchen <=", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenLike(String value) {
            addCriterion("canshumingchen like", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenNotLike(String value) {
            addCriterion("canshumingchen not like", value, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenIn(List<String> values) {
            addCriterion("canshumingchen in", values, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenNotIn(List<String> values) {
            addCriterion("canshumingchen not in", values, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenBetween(String value1, String value2) {
            addCriterion("canshumingchen between", value1, value2, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshumingchenNotBetween(String value1, String value2) {
            addCriterion("canshumingchen not between", value1, value2, "canshumingchen");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieIsNull() {
            addCriterion("canshuleibie is null");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieIsNotNull() {
            addCriterion("canshuleibie is not null");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieEqualTo(String value) {
            addCriterion("canshuleibie =", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieNotEqualTo(String value) {
            addCriterion("canshuleibie <>", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieGreaterThan(String value) {
            addCriterion("canshuleibie >", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieGreaterThanOrEqualTo(String value) {
            addCriterion("canshuleibie >=", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieLessThan(String value) {
            addCriterion("canshuleibie <", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieLessThanOrEqualTo(String value) {
            addCriterion("canshuleibie <=", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieLike(String value) {
            addCriterion("canshuleibie like", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieNotLike(String value) {
            addCriterion("canshuleibie not like", value, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieIn(List<String> values) {
            addCriterion("canshuleibie in", values, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieNotIn(List<String> values) {
            addCriterion("canshuleibie not in", values, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieBetween(String value1, String value2) {
            addCriterion("canshuleibie between", value1, value2, "canshuleibie");
            return (Criteria) this;
        }

        public Criteria andCanshuleibieNotBetween(String value1, String value2) {
            addCriterion("canshuleibie not between", value1, value2, "canshuleibie");
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