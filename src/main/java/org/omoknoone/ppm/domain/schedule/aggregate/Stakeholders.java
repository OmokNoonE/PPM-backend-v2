package org.omoknoone.ppm.domain.schedule.aggregate;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "stakeholders")
public class Stakeholders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stakeholders_id", nullable = false)
    private Integer stakeholdersId;

    @JoinColumn(name = "stakeholders_type", nullable = false)
    private Long stakeholdersType;

    @Column(name = "stakeholders_is_deleted")
    private Boolean stakeholdersIsDeleted;

    @Column(name = "stakeholders_deleted_date", length = 30)
    private LocalDateTime stakeholdersDeletedDate;

    @JoinColumn(name = "stakeholders_schedule_id", nullable = false)
    private Long stakeholdersScheduleId;

    @JoinColumn(name = "stakeholders_project_member_id", nullable = false)
    private Long stakeholdersProjectMemberId;

    @Builder
    public Stakeholders(Integer stakeholdersId, Long stakeholdersType, Boolean stakeholdersIsDeleted,
        LocalDateTime stakeholdersDeletedDate, Long stakeholdersScheduleId, Long stakeholdersProjectMemberId) {
        this.stakeholdersId = stakeholdersId;
        this.stakeholdersType = stakeholdersType;
        this.stakeholdersIsDeleted = stakeholdersIsDeleted != null ? stakeholdersIsDeleted : false;
        this.stakeholdersDeletedDate = stakeholdersDeletedDate;
        this.stakeholdersScheduleId = stakeholdersScheduleId;
        this.stakeholdersProjectMemberId = stakeholdersProjectMemberId;
    }
}