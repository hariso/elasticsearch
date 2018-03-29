package org.elasticsearch.index.reindex;

import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.common.xcontent.XContentParser;

import java.io.IOException;

import static org.elasticsearch.common.xcontent.XContentParserUtils.ensureExpectedToken;

public class UpdateByQueryResponse extends DocWriteResponse {
    public static UpdateByQueryResponse fromXContent(XContentParser parser) throws IOException {
        ensureExpectedToken(XContentParser.Token.START_OBJECT, parser.nextToken(), parser::getTokenLocation);

        UpdateByQueryResponse.Builder context = new UpdateByQueryResponse.Builder();
        while (parser.nextToken() != XContentParser.Token.END_OBJECT) {
            parseXContentFields(parser, context);
        }
        return context.build();
    }

    private static void parseXContentFields(XContentParser parser, Builder context) {
        
    }

    public static class Builder extends DocWriteResponse.Builder {
        @Override
        public UpdateByQueryResponse build() {
            return null;
        }
    }
}
