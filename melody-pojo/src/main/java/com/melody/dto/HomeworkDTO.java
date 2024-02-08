package com.melody.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeworkDTO implements java.io.Serializable {

    @ApiModelProperty("作业标题")
    private String title;

    @ApiModelProperty("作业内容")
    private String content;

    @ApiModelProperty("温馨提示")
    private String prompt;

    @DateTimeFormat(pattern="YYYY-MM-dd HH:mm:ss")
    @ApiModelProperty("截止时间")
    private LocalDateTime deadline;

    @ApiModelProperty("班级主键id")
    private Long classId;


}
