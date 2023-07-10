package com.study.security_lim.web.dto.notice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetNoticeListRespDto {
	private int noticeCode;
	private String noticeTitle;
	private String userId;
	private String createDate;
	private int noticeCount;
	private int totalNoticeCount;
}
