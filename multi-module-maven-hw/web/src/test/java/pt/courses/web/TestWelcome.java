package pt.courses.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import pt.courses.web.config.SpringConfig;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringJUnitWebConfig(SpringConfig.class)
@DisplayName("Test Spring MVC default view")
public class TestWelcome {

    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext webAppContext;
    
//    @BeforeEach
    public void setup() {
	mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
    }
    
//    @Test
    public void testDeafult() throws Exception {
	
	this.mockMvc.perform(
		get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("query", "123456"));
	
    }
}
