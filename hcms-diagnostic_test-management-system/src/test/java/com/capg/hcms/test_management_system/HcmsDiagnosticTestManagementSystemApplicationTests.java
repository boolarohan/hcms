package com.capg.hcms.test_management_system;

/*
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertThrows;
 * 
 * import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.capg.hcms.test_management_system.exception.ListEmptyException;
 * import com.capg.hcms.test_management_system.exception.TestNotFoundException;
 * import com.capg.hcms.test_management_system.model.DiagnosticTest; import
 * com.capg.hcms.test_management_system.repository.IDiagnosticTestRepo; import
 * com.capg.hcms.test_management_system.service.DiagnosticTestServiceImpl;
 * 
 * @SpringBootTest class HcmsDiagnosticTestManagementSystemApplicationTests {
 * 
 * @Autowired IDiagnosticTestRepo repo;
 * 
 * @Autowired DiagnosticTestServiceImpl service; DiagnosticTest test1;
 * DiagnosticTest test2;
 * 
 * @BeforeEach public void init() { test1 = new DiagnosticTest("", "LFT"); test2
 * = new DiagnosticTest("59659", "Blood Sugar"); }
 * 
 * @Test public void testAddtest() { service.addTest(test1);
 * assertEquals(true,repo.getByTestName(test1.getTestName())!=null); }
 * 
 * @Test public void testRemovetest() { service.removeTest(test2);
 * assertEquals(false,repo.getByTestName(test2.getTestName())!=null); }
 * 
 * @Test public void testException() { Throwable exception =
 * assertThrows(TestNotFoundException.class, ()->{ service.removeTest(test2);
 * }); assertEquals("["+test2.getTestId()+"] is Not Found",
 * exception.getMessage()); }
 * 
 * @Test public void testException1() { Throwable exception =
 * assertThrows(ListEmptyException.class, ()->{ service.getAllTests(); });
 * assertEquals("List is empty", exception.getMessage()); }
 * 
 * }
 */
