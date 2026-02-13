package org.uit.utimea.features.timetable.dto.response;

import lombok.Builder;
import org.uit.utimea.shared.dto.response.MasterData;

@Builder
public record TimetableInfoResponse(
        Long id,
        String name,
        MajorSectionResponse majorSection,
        CodeValueResponse academicYear,
        MasterData masterData
) {}
