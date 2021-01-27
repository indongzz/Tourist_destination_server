package com.kop.daegudot.web.dto.recommend;

import com.kop.daegudot.domain.hashtag.Hashtag;
import com.kop.daegudot.domain.mainschedule.MainSchedule;
import com.kop.daegudot.domain.recommendschedule.RecommendSchedule;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RecommendScheduleResponseDto {
    private MainSchedule mainSchedule;
    private String title;
    private String content;
    private List<Hashtag> hashtags;

    public RecommendScheduleResponseDto(RecommendSchedule recommendSchedule){
        this.mainSchedule = recommendSchedule.getMainSchedule();
        this.title = recommendSchedule.getTitle();
        this.content = recommendSchedule.getContent();
        this.hashtags = recommendSchedule.getHashtags();
    }
}
