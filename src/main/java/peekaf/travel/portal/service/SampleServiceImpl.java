package peekaf.travel.portal.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import peekaf.travel.portal.dao.SampleDAO;


@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Resource(name="sampleDAO")
	private SampleDAO sampleDAO;
	
	
	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return sampleDAO.selectBoardList(map);
	}

}