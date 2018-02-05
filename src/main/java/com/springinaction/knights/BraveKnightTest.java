package com.springinaction.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() throws QuestException {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
}

private Quest mock(Class<Quest> class1) {
	// TODO Auto-generated method stub
	return null;
}
}
