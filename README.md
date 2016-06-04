# IItem Renderer
IItem Renderer API gives you ability to hook into item rendering. More specifically:
- Use GL calls during item rendering.
- Super-ultra-hyper-dynamic rendering.
- Change GUI overlay.

### Installation
1. Go to [releases section](https://github.com/elix-x/IItem-Renderer/releases).
2. Download API and drop contents into your src/api/java folder.
3. Download DEV jar and drop into your run/mods folder.

### Usage
- IItem Renderer API has only 2 classes: [IItemRendererAPI](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRendererAPI.java) and [IItemRenderer](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java).
- You implement [IItemRenderer interface](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java) (you CAN use anonymous class), and you give an instance to [IItemRendererAPI.registerIItemRenderer()](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRendererAPI.java#L41) with Item whose rendering [IItemRenderer](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java) is going to handle.
- You use methods in your [IItemRenderer](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java) implementation to do stuff.

### Differences with forge 1.7.10 IItem Renderer
While mostly everything is the same, there is 1 crucial difference: In forge's *1.7.10* IItemRenderer, you used it to *override* rendering. Here you use it *in conjuction* with default rendering. But you *can* use it to *override*.

##### All API methods and classes have description explaining how to use them

### Demos
[GL Calls Test: ![GL Calls Test](http://i.imgur.com/NhbYsFp.png)](https://github.com/elix-x/IItem-Renderer/blob/master/src/test/java/code/elix_x/mods/iitemrenderer/test/IIRGLCallsTest.java)


_More demos will come in close future_
