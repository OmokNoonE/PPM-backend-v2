package org.omoknoone.ppm.domain.projectDashboard.service;

import java.util.List;

import org.omoknoone.ppm.domain.projectDashboard.dto.GraphDTO;

public interface GraphService {
	List<GraphDTO> viewProjectDashboardByProjectId(String projectId);
	void updateGauge(String projectId);
	void updatePie(String projectId, String type);
	void updateTable(String projectId, String type);

	void updateColumn(String projectId, String type);
	void updateLine(String projectId, String type);
}