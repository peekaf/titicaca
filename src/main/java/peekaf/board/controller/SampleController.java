package peekaf.board.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import peekaf.board.service.SampleService;

@Controller
public class SampleController {
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/sample/openSampleBoardList")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/sample/boardList");
		
		List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
}
