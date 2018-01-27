package peekaf.travel.portal.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import peekaf.travel.common.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unckecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}

}
