package peekaf.travel.titicaca.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import peekaf.travel.titicaca.sample.service.SampleService;

@Controller
public class SampleController {
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/sample/openBoardList")
	public ModelAndView openBoardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/sample/boardList");
		
		List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping(value="/sample/openBoardWrite")
	public ModelAndView openBoardWrite(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("sample/boardWrite");
		
		return mv;
	}
	
	
}
