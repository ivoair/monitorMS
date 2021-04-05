package com.ivoair.ms;

import org.springframework.boot.SpringApplication;

import com.ivoair.arq.IvoairApplication;

/**
 * The Class Application.
 */
@IvoairApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    
        // Add an `EventProcessor` to the current scope. Note that
        // this helper will process *all* future events in this scope.
//        Sentry.configureScope(scope -> {
//          scope.addEventProcessor(new EventProcessor() {
//            @Override
//            public SentryEvent process(SentryEvent event, Object hint) {
//              Message message = new Message();
//              message.setMessage("Overwritten by myEventBuilderHelper!");
//              event.setMessage(message);
//              return event;
//            }
//          });
//        });

    }

}
