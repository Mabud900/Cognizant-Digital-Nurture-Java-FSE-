package com.mabud;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {

    // create the mock
    @Mock
    MessageSender sender;

    //inject the mock
    @InjectMocks
    NotificationService service;

    @Test
    void testNotify() {
        // stub the mock
        when(sender.send("hello")).thenReturn("hello");

        // call the method on the SERVICE (not the mock)
        String result = service.notify("hello");

        // assert the result
        assertEquals("hello", result);

        // verify the mock was called
        verify(sender).send("hello");
    }

}