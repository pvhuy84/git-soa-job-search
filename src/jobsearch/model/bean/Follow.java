package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Follow {
	private int recruitmentId;
	private int jobseekerId;
	public Follow() {
	}
	public Follow(int recruitmentId, int jobseekerId) {
		this.recruitmentId = recruitmentId;
		this.jobseekerId = jobseekerId;
	}
	public int getRecruitmentId() {
		return recruitmentId;
	}
	public void setRecruitmentId(int recruitmentId) {
		this.recruitmentId = recruitmentId;
	}
	public int getJobseekerId() {
		return jobseekerId;
	}
	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("recruitmentId", recruitmentId);
			obj.put("jobseekerId", jobseekerId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
