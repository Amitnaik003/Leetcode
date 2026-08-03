select tweet_id
from Tweets
where Char_Length(content) > 15;