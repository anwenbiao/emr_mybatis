package com.taiji.emr_demo.gen.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 住院就诊登记表
 * </p>
 *
 * @author anwenbiao
 * @since 2020-02-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("core_db.T_INP_PATIENT_REG")
public class TInpPatientReg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID(PK)值为UUID
     */
    @TableField("ID")
    private String id;

    /**
     * 机构ID
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 患者基本信息ID(CORE_DB.T_INDEX_PATIENT_INFO.ID)
     */
    @TableField("PATIENT_INFO_ID")
    private String patientInfoId;

    /**
     * 姓名
     */
    @TableField("PATIENT_NAME")
    private String patientName;

    /**
     * 性别 T_DATA_DICT(GB/T2261.1)
     */
    @TableField("GENDER_CODE")
    private String genderCode;

    /**
     * 年龄
     */
    @TableField("AGE")
    private Integer age;

    /**
     * 年龄单位 T_DATA_DICT(PH0008)
     */
    @TableField("AGE_UNIT")
    private String ageUnit;

    /**
     * 年龄文本
     */
    @TableField("AGE_TEXT")
    private String ageText;

    /**
     * 住院号 (住院病案号，病人主索引中取，如果没有，在入院登记时生成)
     */
    @TableField("RECORD_NUM")
    private String recordNum;

    /**
     * 住院次数
     */
    @TableField("INP_TIMES")
    private BigDecimal inpTimes;

    /**
     * 病人入院类型 T_DATA_DICT(PH0012)，转诊入院、门诊入院、直接入院、其它
     */
    @TableField("PATIENT_TYPE")
    private String patientType;

    /**
     * 病人状态，T_DATA_DICT(PH0013)，待分床、在院、待出院、已出院、已结算
     */
    @TableField("PATIENT_STATUS")
    private String patientStatus;

    /**
     * 病人类型 DICT_PATIENT_TYPE.ID
     */
    @TableField("PATIENT_TYPE_ID")
    private String patientTypeId;

    /**
     * 科室ID
     */
    @TableField("DEPT_ID")
    private String deptId;

    /**
     * 病区ID T_AREA.ID
     */
    @TableField("AREA_ID")
    private String areaId;

    /**
     * 床位ID CORE_DB.T_AREA_BED_REG.ID
     */
    @TableField("BED_ID")
    private String bedId;

    /**
     * 是否在床 1:在床，2:退床
     */
    @TableField("IS_IN_BED")
    private String isInBed;

    /**
     * 登记时间(由页面输入，没有则填写系统时间)
     */
    @TableField("ADMISSION_DATE")
    private LocalDateTime admissionDate;

    /**
     * 登记系统时间
     */
    @TableField("ADMISSION_SYSDATE")
    private LocalDateTime admissionSysdate;

    /**
     * 入科时间 (由页面输入，没有则填写系统时间)如果要查入院时间请查安床时间
     */
    @TableField("IN_DEPT_DATE")
    private LocalDateTime inDeptDate;

    /**
     * 入科系统时间
     */
    @TableField("IN_DEPT_SYSDATE")
    private LocalDateTime inDeptSysdate;

    /**
     * 出院科室ID
     */
    @TableField("LEAV_HOSP_DEPT_ID")
    private String leavHospDeptId;

    /**
     * 出院日期
     */
    @TableField("LEAV_HOSP_DATE")
    private LocalDateTime leavHospDate;

    /**
     * 出院方式 T_DATA_DICT(CV5501.16)
     */
    @TableField("LEAV_HOSP_TYPE")
    private String leavHospType;

    /**
     * 住院患者治疗结果 T_DATA_DICT(CV5501.11)
     */
    @TableField("LEAV_HOSP_STATUS")
    private String leavHospStatus;

    /**
     * 门诊挂号登记ID CORE_DB.T_OUT_PATIENT_REG.ID
     */
    @TableField("OUT_PATIENT_REG_ID")
    private String outPatientRegId;

    /**
     * 入院申请医生ID
     */
    @TableField("REG_APPLY_DOCTOR")
    private String regApplyDoctor;

    /**
     * 主治医生ID
     */
    @TableField("ATTENDING_DOCTOR")
    private String attendingDoctor;

    /**
     * 主管护士ID
     */
    @TableField("PRIMARY_NURSE")
    private String primaryNurse;

    /**
     * 退床时间
     */
    @TableField("RETREAT_BED_DATE")
    private LocalDateTime retreatBedDate;

    /**
     * 退床经办人
     */
    @TableField("RETREAT_BED_BY")
    private String retreatBedBy;

    /**
     * 费用类型 T_DATA_DICT(PH0092)
     */
    @TableField("COST_TYPE")
    private String costType;

    /**
     * 备注(说明)
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 创建记录人
     */
    @TableField("CREATE_BY")
    private String createBy;

    /**
     * 创建记录时间
     */
    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    /**
     * 修改记录人
     */
    @TableField("MODIFY_BY")
    private String modifyBy;

    /**
     * 修改记录时间
     */
    @TableField("MODIFY_DATE")
    private LocalDateTime modifyDate;

    /**
     * 是否有效：0代表无效，1代表有效
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否新生儿 0：否，1：是
     */
    @TableField("IS_NEWBABY")
    private String isNewbaby;

    /**
     * 母亲ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 坏账标示：1代表正常，2代表坏账
     */
    @TableField("BAD_DEBT")
    private String badDebt;

    /**
     * 转出状态 0：未转出，1：已转出
     */
    @TableField("TURN_STATUS")
    private String turnStatus;

    /**
     * 治疗科室ID
     */
    @TableField("TREAT_DEPT_ID")
    private String treatDeptId;

    /**
     * 入院情况 T_DATA_DICT(PH0075)
     */
    @TableField("CONDITION")
    private String condition;

    /**
     * 申请科室ID
     */
    @TableField("REG_APPLY_DEPT_ID")
    private String regApplyDeptId;

    /**
     * 申请病区ID
     */
    @TableField("REG_APPLY_AREA_ID")
    private String regApplyAreaId;

    /**
     * 出院病区
     */
    @TableField("OUT_AREA_ID")
    private String outAreaId;

    /**
     * 报销地
     */
    @TableField("APPLY_DDRESS")
    private String applyDdress;

    /**
     * 保险号
     */
    @TableField("INSURANCE_NUM")
    private String insuranceNum;

    /**
     * x射线号
     */
    @TableField("X_RADIAL_NUM")
    private String xRadialNum;

    /**
     * 出院床位
     */
    @TableField("OUT_BED")
    private String outBed;

    /**
     * 默责任护士
     */
    @TableField("CHANGE_NURSE")
    private String changeNurse;

    /**
     * 0未收卡，1已经收卡
     */
    @TableField("CARD_RECEIVED")
    private String cardReceived;

    /**
     * 申请状态，用于结算申请，0：未申请，1：中结申请，2：出院申请，3：已处理，4：已中结，5：已结算
     */
    @TableField("APPLY_STATUS")
    private String applyStatus;

    /**
     * 区分电力医院(0)和天坛医院(1)
     */
    @TableField("PATH")
    private String path;

    /**
     * 入院途径PH0093
     */
    @TableField("ADMISSION_PATHWAY")
    private String admissionPathway;

    /**
     * 中途结算申请时间
     */
    @TableField("APPLY_DATE")
    private LocalDateTime applyDate;

    /**
     * 中途结算申请结算截止时间
     */
    @TableField("APPLY_MIDSETTLE_DATE")
    private LocalDateTime applyMidsettleDate;

    /**
     * 死亡时间
     */
    @TableField("DEATH_DATE")
    private LocalDateTime deathDate;

    /**
     * 门诊病案号
     */
    @TableField("OUT_RECORD_NUM")
    private String outRecordNum;

    /**
     * 病人状态，1-代转科，2-待出院
     */
    @TableField("SPEC_STATUS")
    private String specStatus;

    /**
     * 入院科室
     */
    @TableField("IN_DEPT")
    private String inDept;

    /**
     * 入院病区
     */
    @TableField("IN_AREA")
    private String inArea;

    /**
     * 是否新门诊病历 1：是 0：否
     */
    @TableField("IS_NEWOUTMRECORD")
    private String isNewoutmrecord;

    /**
     * RH血型
     */
    @TableField("RH_BLOOD_TYPE")
    private String rhBloodType;

    /**
     * ABO血型
     */
    @TableField("ABO_BLOOD_TYPE")
    private String aboBloodType;

    /**
     * 住院流水号
     */
    @TableField("INP_FLOW_NO")
    private String inpFlowNo;

    /**
     * 职业
     */
    @TableField("PROFESSION_ID")
    private String professionId;

    /**
     * 出生日期
     */
    @TableField("BIRTH_DATE")
    private LocalDateTime birthDate;

    /**
     * 民族
     */
    @TableField("NATION_NAME")
    private String nationName;

    /**
     * 婚姻状况
     */
    @TableField("MARITAL_NAME")
    private String maritalName;

    /**
     * 住院类型(PH0151)
     */
    @TableField("INP_TYPE")
    private String inpType;

    /**
     * 医保住院流水号
     */
    @TableField("FLOW_NO")
    private String flowNo;


}
