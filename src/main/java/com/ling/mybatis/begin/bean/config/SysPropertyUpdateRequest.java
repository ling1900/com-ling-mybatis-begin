package com.ling.mybatis.begin.bean.config;

import com.ling.mybatis.begin.bean.common.UpdateRequestBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "更新系统配置")
public class SysPropertyUpdateRequest extends UpdateRequestBase {
    @ApiModelProperty
    public Long seqId;

    @ApiModelProperty(value = "配置组")
    public String sysGroup;

    @ApiModelProperty(value = "配置项名")
    public String sysKey;

    @ApiModelProperty(value = "配置值")
    public String sysValue;

    @ApiModelProperty(value = "备注")
    public String remark;

    @ApiModelProperty(value = "是否有效")
    public Integer enable;
}
